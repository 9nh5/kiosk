class Cart{
    val cartList = ArrayList<Abstractmenu>()

   fun addCart(item:Abstractmenu){
       cartList.add(item)
   }

    fun displayCart() {
        var totalprice:Int=0
        cartList.forEach {item -> totalprice += item.price
        println(Menu(item).displayInfo())
        }
        println("\n[총 주문금액] : [$totalprice ₩]")
    }
}