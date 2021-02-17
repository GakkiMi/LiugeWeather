package com.liuge.liugeweather.onlytest

/**
 * 文 件 名：Test1
 * 描   述：TODO
 */
class Test1 {
    var x: Int = 0
    lateinit var str: String
    var y = 9


    init {

    }


    fun tes() {

        var arrayListTwo = arrayOf(1, 3, 5, 7, 9)
        for ((ss, bb) in arrayListTwo.withIndex()) {
            println("index => $ss \t value => $bb")
        }
        for (xx in 3..99 step 2) {
            print(xx)
        }

        var arr4 = Array(5) { aa -> aa * 2 }
        for (v in arr4) {
            print(v)
            print("\t")
        }


        val testStr: String? = null
        val result = testStr?.length?.plus(5)?.minus(5);
        println(result)
//迭代
        for (s in str) {
            print(s)
            print("\t")
        }


        val arrTest: Array<Int?> = arrayOf(1, 2, null, 3, null, 5, 6, null)

        // 传统写法
        for (index in arrTest) {
            if (index == null) {
                continue
            }
            println("index => $index")
        }

        fun defArgs(numA: Int? = null, numB: Float, numC: Boolean = false) {
            var x= numA?.plus(1)
            println("numA  =  $numA \t numB = $numB \t numC = $numC")
        }

        fun callFun(
                    isTrue : Boolean = false,
                    numA : Int = 2,
            str : String,
                    numB: Float = 2.0f,
                    numC : Int = 2){}

        fun main(args: Array<String>) {

            // 默认参数的函数使用
            defArgs(1, 10f, true)
            defArgs(numB=10f, numC=true)
        }
        fun varargFun(vararg str: Int, numA: Int){
            // ...
        }

        fun funArgs(numA : Int, numB : Float){
            println("numA = $numA \t numB = $numB")
        }
        val str = "kotlin very good"

        str.indexOf("0",0)
// 如果未查找到满足条件的元素，会抛出NoSuchElementException异常
        var ss: Char =str.first{ it == 'o' }
    }


}

open class A {
    open fun foo(i: Int=10) {

    }
}

class B : A() {
    override fun foo(i: Int) {
        super.foo(i.plus(8))
        println(i)
        var x=i.plus(4)
    }
}

fun main(args: Array<String>) {
    B().foo()
}

