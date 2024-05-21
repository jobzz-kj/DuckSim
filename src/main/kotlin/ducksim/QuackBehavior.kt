package main.kotlin.ducksim

import ducksim.State

interface QuackBehavior {
    val state: State
    val quackText: String
}