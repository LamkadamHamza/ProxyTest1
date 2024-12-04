import {Component, OnInit} from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {Observable} from "rxjs";
import {Etudient} from "./models/Etudient";
import {NgForOf} from "@angular/common";
import {ToastrService} from "ngx-toastr";


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, NgForOf],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  baseURL:string="http://localhost:2222";

  etudientList:Etudient[]=[];
   constructor(private  Httpcleint: HttpClient , private toastr: ToastrService) {
   }
  ngOnInit(): void {

     this.getAllEtudient().subscribe(res=>{
         res.map(((obj: Etudient)=>{
           this.etudientList.push(obj)
         }))
       },
       error=>{
         this.toastr.error('An error occurred: ' + error.message, 'Error');
       })

  }

  getAllEtudient(): Observable<any>{
    let headers = new HttpHeaders();
    headers.append("Access-Control-Allow-Origin", "*")
    return this.Httpcleint.get(this.baseURL + "/Etudiant/liste",{headers})
  }
}
