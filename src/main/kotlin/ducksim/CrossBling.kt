package main.kotlin.ducksim

class CrossBling(duck: Duck) : Bling(duck) {
    override fun display(): String {
        return duck.display() + ":+"
    }
}