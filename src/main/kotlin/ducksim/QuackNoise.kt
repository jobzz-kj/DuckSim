package main.kotlin.ducksim

import ducksim.State

class QuackNoise : QuackBehavior {
    override val state = State.QUACKING
    override val quackText = "Noise!"
}