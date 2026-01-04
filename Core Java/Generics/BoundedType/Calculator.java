package BoundedType;

class Calculator<T extends Number> {
    
    double square(T num) {
        return num.doubleValue() * num.doubleValue();
    }
}

