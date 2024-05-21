package main.kotlin.ducksim

import ducksim.State

interface FlyBehavior {
    val state: State;
}