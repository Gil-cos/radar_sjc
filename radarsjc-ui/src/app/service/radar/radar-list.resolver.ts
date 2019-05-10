import { RadarDia } from 'src/app/model/RadarDia';
import { Injectable } from '@angular/core';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Observable } from 'rxjs';
import { RadarService } from './radar.service';

@Injectable({ 
    providedIn: 'root' 
})
export class RadarListResolver implements Resolve<Observable<RadarDia[]>>{

    constructor(private radarService: RadarService) { }

    resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Observable<RadarDia[]> {
        return this.radarService.getWeek();
    }
}