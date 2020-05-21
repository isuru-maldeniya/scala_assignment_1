object q2 extends App{
    def priceForBooks(num:Int)=24.95*num*60/50
    def shipingCost(num:Int)=if(num<=50) 3*50 else 3*50+0.75(num-50)

    val hsalePrice:Double=priceForBooks(60)+shipingCost(60);
    println(hsalePrice);
}