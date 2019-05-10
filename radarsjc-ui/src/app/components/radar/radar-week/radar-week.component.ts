import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material';
import { ActivatedRoute } from '@angular/router';
import { RadarDia } from 'src/app/model/RadarDia';

@Component({
  selector: 'app-radar-week',
  templateUrl: './radar-week.component.html',
  styleUrls: ['./radar-week.component.css']
})
export class RadarWeekComponent implements OnInit {

  public displayedColumns = ['date', 'local'];
  public dataSource = new MatTableDataSource<RadarDia>();

  constructor(
    private route: ActivatedRoute
  ) { }

  ngOnInit() {
    this.getAll();
  }

  getAll() {
    this.dataSource = this.route.snapshot.data['radarList'];
  }

}
