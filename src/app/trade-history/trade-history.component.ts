import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-trade-history',
  templateUrl: './trade-history.component.html',
  styleUrls: ['./trade-history.component.css']
})

export class Trade{
  constructor(
    public TradeNo:any,
    public CurrencyPair:string,
    public CustomerName:string,
    public Amount:number,
    public Rate:number
  )
  {

  }
}
export class TradeHistoryComponent implements OnInit {
  //trades=[new Trade(12,'asd','dsad',123,213)]
  constructor() { }

  ngOnInit(): void {
    
  }

}
