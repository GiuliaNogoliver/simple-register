package br.com.component.user.management.model;

public enum DepartmentEnum {
    DEVELOPMENT("Software development"),
    INFRASTRUCTURE("IT infrastructure"),
    DESIGN("Product design"),
    MARKETING("Marketing and advertising"),
    SALES("Sales and customer acquisition"),
    HUMAN_RESOURCES("Human resources and talent management"),
    FINANCIAL("Financial management and accounting"),
    CUSTOMER_SUPPORT("Customer support and service");

    private String description;

    DepartmentEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}