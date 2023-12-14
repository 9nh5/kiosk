import java.awt.SystemColor.menu
import java.lang.IllegalArgumentException

fun main() {
    println("[Winter Season Bakery]\n")
    println("[1] 포장하기 [2] 매장식사")

    val choice = readLine()!!.toInt()
    when (choice) {
        1 -> {
            println("\n포장을 선택하셨습니다\n")
            println("메뉴를 선택해주세요\n")
            println("[Winter Season Bakery - Menu]\n")
            println("[1] 붕어빵")
            println("[2] 계란빵")
            println("[3] 타코야끼")
            println("[4] 음료")
            println("[5] 장바구니")
            println("[0] 주문 취소")
        }
        2 -> {
            println("매장 식사를 선택하셨습니다\n")
            println("메뉴를 선택해주세요\n")
            println("[Winter Season Bakery - Menu]\n")
            println("[1] 붕어빵")
            println("[2] 계란빵")
            println("[3] 타코야끼")
            println("[4] 음료")
            println("[5] 장바구니")
            println("[0] 주문 취소")
        }
        else -> {
            println("잘못된 입력입니다. 처음부터 다시 시도하여 주십시오")

        }

    }

    val select = readLine()!!.toInt()

    val productMenu = ProductMenu()
    val cart = Cart()


    when(select){
        1 -> {
            println("[붕어빵 메뉴입니다]\n")
            productMenu.displayMenu("boong")
            val select1 = readLine()?.toInt()
            when(select1) {
                1 -> productMenu.addMenu(1, "boong")
                2 -> productMenu.addMenu(2, "boong")
                3 -> productMenu.addMenu(3, "boong")
                4 -> productMenu.addMenu(4, "boong")
            }

        }

        2 -> {
            println("\n[계란빵 메뉴입니다]\n")
            productMenu.displayMenu("egg")
            val select2 = readLine()?.toInt()
            when(select2) {
                1 -> productMenu.addMenu(1, "egg")
                2 -> productMenu.addMenu(2, "egg")
                3 -> productMenu.addMenu(3, "egg")
            }
        }
        3 -> {
            println("\n[타코야끼 메뉴입니다]\n")
            productMenu.displayMenu("guitar")
            val select3 = readLine()?.toInt()
            when(select3) {
                1 -> productMenu.addMenu(1, "guitar")
                2 -> productMenu.addMenu(2, "guitar")
                3 -> productMenu.addMenu(3, "guitar")
                4 -> productMenu.addMenu(4, "guitar")
            }
        }
        4 -> {
            println("\n[음료 메뉴입니다]\n")
            productMenu.displayMenu("drink")
            val select4 = readLine()?.toInt()
            when(select4) {
                1 -> productMenu.addMenu(1, "drink")
                2 -> productMenu.addMenu(2, "drink")
                3 -> productMenu.addMenu(3, "drink")
                4 -> productMenu.addMenu(4, "drink")
            }
        }
        5 -> {
            cart.displayCart()
        }
        0 -> println("처음 화면으로 돌아갑니다")
    }
}

