package com.registro.usuarios.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;
@Entity
@Table(name="RESERVAS")
public class Reserva {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		@NotNull
		private String fecha;
		@NotNull
		private String hora;
		private double mon;
		private double nas;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFecha() {
			return fecha;
		}
		public void setFecha(String fecha) {
			this.fecha = fecha;
		}
		public String getHora() {
			return hora;
		}
		public void setHora(String hora) {
			this.hora = hora;
		}
		public double getMon() {
			return mon;
		}
		public void setMon(double mon) {
			this.mon = mon;
		}
		public double getNas() {
			return nas;
		}
		public void setNas(double nas) {
			this.nas = nas;
		}
		@Override
		public String toString() {
			return "Reserva [id=" + id + ", fecha=" + fecha + ", hora=" + hora + ", mon=" + mon + ", nas=" + nas + "]";
		}			
}
