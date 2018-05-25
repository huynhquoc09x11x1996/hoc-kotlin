package Singleton

object Main {

    class A private constructor()
    {
        init {
            println("class A khởi tạo.... $this")
        }
       companion object {
           val INSTANCE = A()
           @JvmStatic fun getInstance(): A
           {
               return INSTANCE
           }
       }

    }

    class B private constructor()
    {
        init {
            println("class A khởi tạo.... $this")
        }
        companion object {
            val INSTANCE = B()
            @JvmStatic fun getInstance(): B
            {
                return INSTANCE
            }
        }

    }
    @JvmStatic fun main(args: Array<String>)
    {
        var a1=A.getInstance()
        var a2=A.getInstance()
        var a3=A.getInstance()

    }
}