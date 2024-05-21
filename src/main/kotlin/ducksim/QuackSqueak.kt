package main.kotlin.ducksim

import ducksim.State

class QuackSqueak: QuackBehavior {
    override val state: State = State.QUACKING
    override val quackText: String = "Squeak"
}