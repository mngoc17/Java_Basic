package Day6.Class;

public class Categories {
    String categoryId;
    String categoryName;
    String description;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Categories: " +
                "categoryId: " + categoryId +
                ", categoryName: " + categoryName +
                ", description='" + description;
    }
}
