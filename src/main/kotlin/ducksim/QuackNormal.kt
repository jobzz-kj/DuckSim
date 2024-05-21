package main.kotlin.ducksim

import ducksim.State

class QuackNormal :QuackBehavior {
    override val state: State = State.QUACKING
    override val quackText: String = "Quack!"
}