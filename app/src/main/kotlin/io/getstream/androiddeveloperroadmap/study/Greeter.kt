package io.getstream.androiddeveloperroadmap.study

//public 可以省略
public class Greeter(val name:String) {
    //无参数，无返回值 函数, public 可以省略
    public fun greet() {
        println("hello $name")
    }

    //有参数，有返回值 函数
    fun greet(a:Int, b:String): Boolean {
        println("$a $b")
        return true
    }

    //表达式作为函数体，返回类型自动推断
    fun sumExternal(a: Int, b: Int) = a + b
    fun funInside() {
        fun sumInside(a: Int, b: Int) = a + b
        println(sumInside(1, 1))
    }

    //可变长函数
    fun argsAutoLength(vararg v: Int) {
        println("argsAutoLength")
        for (i in v) {
            println("key $i")
        }
    }

    //匿名函数（lambda）
    fun lambda() {
        println("lambda")
        val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
        println(sumLambda(1, 2))
    }

    //定义常量与变量
    fun constArgs() {
        //可变变量定义
        //var <标识符> : <类型> = <初始化值>
        var arg : Int = 1;
        arg+=1

        //不可变变量定义：val 关键字，只能赋值一次的变量(类似Java中final修饰的变量)
        val finalArg : Int = 1

        // 系统自动推断变量类型为Int
        val b = 1

        val c: Int // 如果不在声明时初始化则必须提供变量类型
        c = 1//明确赋值

        println("constArgs")
    }

    //字符串模版
    fun stringTemplate() {
        var a = 1
        val s1 = "a is $a"

        a = 2
        val s2 = "${s1.replace("is", "was")} , but now is $a"
        println(s2)
    }

    //Null检查
    fun nullCheck() {
        //类型后面加？表示可为空
        var age :String ? = "22"
        //抛出null异常
        val ages = age!!.toInt()
        //不做处理返回null
        val ages1 = age?.toInt()
        //age为null返回-1
        val ages2 = age?.toInt() ?: -1
    }

    //Null检查
    fun nullCheck2(args: Array<String>) {
        if (args.size < 2) {
            println("args size < 2")
            return
        }
        val parseInt: (String) -> Int = {str -> Integer.parseInt(str)}

        val x = parseInt(args[0])
        val y = Integer.parseInt(args[1])
        // 直接使用 `x * y` 会导致错误, 因为它们可能为 null.
        if (x != null && y != null) {
            println(x * y)
        }
    }
}

fun main(args: Array<String>) {
    val greeter = Greeter("bigwen");
    greeter.greet()
    greeter.argsAutoLength(3, 10)
    greeter.lambda()
    greeter.stringTemplate()
}