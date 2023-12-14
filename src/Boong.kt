class Boong(id:Int, category:String, name: String, price: Int, explain: String) : Abstractmenu(id,category, name, price, explain) {
    override fun displayInfo(): String {
        return "[$name] | $price ₩ * 2개 | $explain".format(name, price, explain)
    }
}
