abstract class Abstractmenu(val id:Int, val category:String, val name:String, val price:Int, val explain:String) {
    abstract fun displayInfo():String
    }
