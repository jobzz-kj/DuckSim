package main.kotlin.ducksim

import ducksim.State

class QuackNoWay:QuackBehavior {
    override val state: State = State.SWIMMING
    override val quackText: String = ""
}