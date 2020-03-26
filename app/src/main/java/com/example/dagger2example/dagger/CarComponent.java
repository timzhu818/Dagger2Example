package com.example.dagger2example.dagger;

import com.example.dagger2example.Main2Activity;
import com.example.dagger2example.car.Car;
import com.example.dagger2example.car.DieselEngine;

import dagger.BindsInstance;
import dagger.Component;

@Component (modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(Main2Activity main2Activity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(int horsePower);

        CarComponent build();
    }
}
