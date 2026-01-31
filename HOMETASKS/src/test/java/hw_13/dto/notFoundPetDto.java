package hw_13.dto;

public class notFoundPetDto {
    private int code;
    private String type;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public notFoundPetDto() {}

    @Override
    public String toString() {
        return "DeleteDto{" +
                "code=" + code +
                ", type='" + type + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
