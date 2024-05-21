package main.kotlin.ducksim

import ducksim.State

class FlyWithWings: FlyBehavior {
    override val state: State = State.FLYING
}