import { Component, OnInit } from '@angular/core';
import { RadarDia } from 'src/app/model/RadarDia';
import { MatTableDataSource } from '@angular/material';
import { RadarService } from 'src/app/service/radar/radar.service';

@Component({
  selector: 'app-radar-week',
  templateUrl: './radar-week.component.html',
  styleUrls: ['./radar-week.component.css']
})
export class RadarWeekComponent implements OnInit {

  public displayedColumns = ['date', 'local'];
  public dataSource = new MatTableDataSource<RadarDia>();

  constructor(
    private radarService: RadarService
  ) { }

  ngOnInit() {
    this.getAll();
  }

  getAll() {
    this.radarService.getWeek()
      .subscribe(res => {
        this.dataSource.data = res as RadarDia[];
      },
        err => {
          console.log(err);
        })
  }

}
