package BuilderPattern


class CarBuilder() {

    init {
        println("Constructor mặc định được gọi")
    }
    var color: String?=null
    var doors : Int=0
    lateinit var something: String
    fun doSomeThing(str: String) : Unit
    {
        something=str
    }

    override fun toString(): String {
        return "CarBuilder(color=$color, doors=$doors, something='$something')"
    }

}
/*
* Builder trong kotlin thì class mang ý nghĩa Builder như CarBuilder trên
* chỉ việc tạo các biến lưu trữ mặc định, hoặc constructor cần thiết
*
* Qua class sử dụng chỉ cần việc gọi ClassName().apply{
*                                               color="yellow"
*                                               doors=100
*                                                       }
*
* */
