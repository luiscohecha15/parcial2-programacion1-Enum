public enum Peluqueria {
    CORTE1("siete","rojo","18", 15000) {
        @Override
        void datos() {
            System.out.println("Corte: "+ this.nombre + ", color: "+ color+ ", edad: "+ edad+", precio: "+precio);

        }
    },
    CORTE2("Moicano","verde","14", 18000) {
        @Override
        void datos() {
            System.out.println("Corte: "+ nombre + ", color: "+ color+ ", edad: "+ edad+", precio: "+precio);
        }
    },
    CORTE3("Mullet","azul","18",20000) {
        @Override
        void datos() {
            System.out.println("Corte: "+ nombre + ", color: "+ color+ ", edad: "+ edad+", precio: "+precio);
        }
    },
    CORTE4("Cuadros","amarillo","18",17000){
        @Override
        void datos() {System.out.println("Corte: "+ nombre + ", color: "+ color+ ", edad: "+ edad+", precio: "+precio);

        }
    };
    String nombre, color, edad;
    int precio;

    Peluqueria(String nombre, String color ,String edad,int precio) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    abstract void datos();

    @Override
    public String toString() {
        return "Peluqueria{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", edad='" + edad + '\'' +
                ", precio=" + precio +
                '}';
    }
}

