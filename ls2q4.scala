@main def main(): Unit = {
    def calc_prof(t_price:Double)=
    {
    var attendance=120+((15-t_price)/5)*20
    var total_expense=attendance*3+500
    var total_income=t_price*attendance
    var profit=total_income-total_expense
    println(s"Profit is $profit")
    }
    calc_prof(15)
    calc_prof(20)
    calc_prof(10)
}