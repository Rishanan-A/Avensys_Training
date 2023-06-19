import { CanActivateFn } from '@angular/router';

export const guard1Guard: CanActivateFn = (route, state) => {
  
  
  if (5<10){
    return true;
  }
  else{
    return false;
  }
  
};
