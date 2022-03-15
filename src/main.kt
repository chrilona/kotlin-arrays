fun main(){
    println(state(45,"bananas"))
    println(identity("Grace"))
    classes(institution = arrayOf("Lisa lab","Lovelace","Anita b"))
    studies(includes= arrayOf(78,56,78,33,506))
    girls(people = arrayOf("hilda","lona","nakayiza","tanyasis"))
}
fun state(a:Int, b:String):String{
    val statement = (" I have $a $b ")
    return statement
}
fun identity(who:String){
    if ( who=="christabel"){

        println("THAT'S ME! ")}

    else{
        println("I DON'T KNOW WHO THAT IS")}
}
fun city(towns:Array<String>){
    for ( x in towns) {
        println(x.length)
    }
}
fun classes(institution:Array<String>){
    institution.forEach { names->
        println(names.lowercase())
    }
}
fun studies(includes:Array<Int>){
    includes.forEach { num->
        println(100 + num)
    }
}
fun girls(people:Array<String>){
    people.forEach {named->
        println(named.length)
    }
}