package main.kotlin.ducksim

import ducksim.State

class QuackHonk : QuackBehavior {
    override val state = State.QUACKING
    override val quackText = "Honk"
}