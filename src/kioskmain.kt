fun main() {
    println("[Winter Season Bakery]\n")


        println("메뉴를 선택해주세요\n")
        println("[Winter Season Bakery - Menu]\n")
        println("[1] 붕어빵")
        println("[2] 계란빵")
        println("[3] 타코야끼")
        println("[4] 음료")
        println("[5] 장바구니")
        println("[0] 주문 취소")

        val select = readLine()!!.toInt()

        val productMenu = ProductMenu()
        val addcart = AddCart()
        val cartList = mutableListOf<dataMenu>() //


        when (select) {
            1 -> {
                while(true){
                println("[붕어빵 메뉴입니다]\n")
                productMenu.displayMenu("boong")
                println("[0] 뒤로가기")
                val select1 = readLine()?.toInt()
                when (select1) {
                    1 -> productMenu.addMenu(1, "boong")
                    2 -> productMenu.addMenu(2, "boong")
                    3 -> productMenu.addMenu(3, "boong")
                    4 -> productMenu.addMenu(4, "boong")
                    0 -> {
                        return main()
                    }
                }
                }
            }

            2 -> {
                while(true) {
                    println("\n[계란빵 메뉴입니다]\n")
                    productMenu.displayMenu("egg")
                    println("[0] 뒤로가기")
                    val select2 = readLine()?.toInt()
                    when (select2) {
                        1 -> productMenu.addMenu(1, "egg")
                        2 -> productMenu.addMenu(2, "egg")
                        3 -> productMenu.addMenu(3, "egg")
                        0 -> {
                            return main()
                        }
                    }
                }
            }

            3 -> {
                while(true){
                println("\n[타코야끼 메뉴입니다]\n")
                productMenu.displayMenu("guitar")
                println("[0] 뒤로가기")
                val select3 = readLine()?.toInt()
                when (select3) {
                    1 -> productMenu.addMenu(1, "guitar")
                    2 -> productMenu.addMenu(2, "guitar")
                    3 -> productMenu.addMenu(3, "guitar")
                    4 -> productMenu.addMenu(4, "guitar")
                    0 -> {
                        return main()
                    }
                }
                }
            }

            4 -> {
                while(true) {
                    println("\n[음료 메뉴입니다]\n")
                    productMenu.displayMenu("drink")
                    println("[0] 뒤로가기")
                    val select4 = readLine()?.toInt()
                    when (select4) {
                        1 -> productMenu.addMenu(1, "drink")
                        2 -> productMenu.addMenu(2, "drink")
                        3 -> productMenu.addMenu(3, "drink")
                        4 -> productMenu.addMenu(4, "drink")
                        0 -> {
                            return main()
                        }
                    }
                }
            }

            5 -> {
                addcart.displayCart()
            }

            0 -> {
                println("처음 화면으로 돌아갑니다")
                return main()
            }
        }
    }





