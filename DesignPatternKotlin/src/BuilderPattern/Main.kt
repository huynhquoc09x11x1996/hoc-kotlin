package BuilderPattern

object Main {

    @JvmStatic fun main(args : Array<String>) {
        var yellowvar=CarBuilder().apply {
            color="yellow"
            doors=3
            doSomeThing("HuynhBaoQuoc")
        }

        println(yellowvar.toString())

    }
}