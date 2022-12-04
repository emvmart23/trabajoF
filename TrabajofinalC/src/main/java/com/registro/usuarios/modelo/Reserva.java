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
		private String fecha_res;
		@NotNull
		private String hora_res;
		@NotNull
		private Integer dni;
		@NotNull
		private Integer telefono;
		@NotNull
		private Integer ruc;
		private double monto;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getFecha_res() {
			return fecha_res;
		}
		public void setFecha_res(String fecha_res) {
			this.fecha_res = fecha_res;
		}
		public String getHora_res() {
			return hora_res;
		}
		public void setHora_res(String hora_res) {
			this.hora_res = hora_res;
		}
		public Integer getDni() {
			return dni;
		}
		public void setDni(Integer dni) {
			this.dni = dni;
		}
		public Integer getTelefono() {
			return telefono;
		}
		public void setTelefono(Integer telefono) {
			this.telefono = telefono;
		}
		public Integer getRuc() {
			return ruc;
		}
		public void setRuc(Integer ruc) {
			this.ruc = ruc;
		}
		@Override
		public String toString() {
			return "Reserva [id=" + id + ", fecha_res=" + fecha_res + ", hora_res=" + hora_res + ", dni=" + dni
					+ ", telefono=" + telefono + ", ruc=" + ruc + "]";
		}
		
		
}
