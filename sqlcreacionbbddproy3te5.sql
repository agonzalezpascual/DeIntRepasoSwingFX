create database proy3te5;
USE proy3te5;
create table donantes (
DNI Varchar(25),
Nombre Varchar(25),
Direccion Varchar(25),
CodPostal Varchar(25),
Localidad Varchar(25),
FechaNac Varchar(25),
Correo Varchar(25),
Telefono Varchar(25),
GrupoSang Varchar(25),
FactorRH Varchar(25)
);
create table sanitariosbanco (
CodSanitario Varchar(25),
NombreSanitario Varchar(25),
FechaDonacion Varchar(25),
Cantidad Varchar(25),
Incidencia Varchar(25),
DniDonante Varchar(25)
);