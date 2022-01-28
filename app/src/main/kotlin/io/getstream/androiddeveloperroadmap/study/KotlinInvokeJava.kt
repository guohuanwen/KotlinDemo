package io.getstream.androiddeveloperroadmap.study

import java.util.HashMap

class KotlinInvokeJava {

    fun invoke() {
        //在 Kotlin 中调用 Java 代码
        val map = HashMap<String, String>();
        map.put("big", "wen");
        map.put("wen", "big");
        for (key in map.keys) {
            println("key: $key");
        }
    }
}

fun main(args:Array<String>) {
    KotlinInvokeJava().invoke();
}