package main.kotlin.ducksim

class MoonBling(duck: Duck) : Bling(duck) {
    override fun display(): String {
        return duck.display() + ":)"
    }
}