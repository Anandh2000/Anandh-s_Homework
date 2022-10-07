import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookTradeComponent } from './book-trade/book-trade.component';
import { MenuComponent } from './menu/menu.component';
import { TradeHistoryComponent } from './trade-history/trade-history.component';
import { WelcomeComponent } from './welcome/welcome.component';

const routes: Routes = [
 
  {
    path:"",component:WelcomeComponent
  },
  {
    path:"menu",component:MenuComponent
  },
  {
    path:"tradeHistory",component:TradeHistoryComponent
  },
  {
    path:"bookTrade",component:BookTradeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
