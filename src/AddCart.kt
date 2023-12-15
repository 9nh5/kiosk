class AddCart{
    val cartList = mutableListOf<dataMenu>()

    fun displayCart() {

        cartList.forEach { println(it) }
        val totalPrice=cartList.sumOf {it.price}
        println("\n[총 주문금액] : [${totalPrice} ₩]")

    }
}
//선택한 메뉴 넣고 ㄷ더하기