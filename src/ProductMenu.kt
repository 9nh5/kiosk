class ProductMenu {
    val products : ArrayList<Abstractmenu> = initproduct()

    fun initproduct():ArrayList<Abstractmenu> {
        val products = ArrayList<Abstractmenu>()

        val boong = arrayListOf<Abstractmenu>(
            Boong(1, "boong", "팥붕어빵", 1000, "겨울엔 팥붕"),
            Boong(2, "boong", "슈크림 붕어빵", 1200, "대세는 슈붕"),
            Boong(3, "boong", "치즈 붕어빵", 1300, "치즈있어유"),
            Boong(4, "boong", "붕어.빵", 10000, "붕어가 있어유..")

        )
        val egg = arrayListOf<Abstractmenu>(
            Egg(1, "egg", "계란빵", 1000, "길거리 음식의 클래식"),
            Egg(2, "egg", "치즈 계란빵", 1500, "치즈+계란이에유"),
            Egg(3, "egg", "햄치즈 계란빵", 1800, "햄+치즈+계란이에유"),

        )
        val guitar = arrayListOf<Abstractmenu>(
            Guitar(1, "guitar", "타코야끼", 3000, "여섯알 있어유"),
            Guitar(2, "guitar", "치즈 타코야끼", 3500, "치즈도 있어유"),
            Guitar(3, "guitar", "핫도그", 2000, "축제 필수 음식"),
            Guitar(4, "guitar", "치즈 핫도그", 2500, "통모짜에유")

        )
        val drink = arrayListOf<Abstractmenu>(
            Drink(1, "drink", "콜라", 1500, "코카콜라입니다. 펩시 취급 안합니다"),
            Drink(2, "drink", "사이다", 1500, "칠성사이다입니다"),
            Drink(3, "drink", "레몬 하이볼", 4000, "달달구리 하이볼입니다"),
            Drink(4, "drink", "참이슬", 4000, "소주.")

        )
        products.addAll(boong)
        products.addAll(egg)
        products.addAll(guitar)
        products.addAll(drink)

        return products
    }
    fun displayMenu(foods:String){
        products.filter {it.category==foods}.forEach {
            println("[${it.id}] | ${Menu(it).displayInfo()}")
        }

    }
    fun addMenu(item:Int, foods:String){

        products.filter {it.id==item && it.category==foods}.forEach{
            println("\n[해당 메뉴를 선택하셨습니다] \n\n"+"${Menu(it).displayInfo()}\n")
        }
    }


    fun addItem(menu:String, id:Int):Abstractmenu?{
        return products.filter{it.category==menu}.find{it.id==id-1}
    }

}