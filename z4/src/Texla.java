class Texla {
    protected double speed;
    protected double maxSpeed;
    protected double acceleration;
    protected double brakingSpeed;
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Texla() {
        acceleration = 30;
        brakingSpeed = 120;
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {
        if (speed < autoPilotMaxSpeed) {
            speed += autoPilotAcceleration;
        } else {
            speed = autoPilotMaxSpeed;
        }
    }


    public void accelerate() {
        if (speed < maxSpeed) {
            speed += acceleration;
        } else {
            speed = maxSpeed;
        }
    }

    public void brake() {
        if (speed > 0) {
            speed -= brakingSpeed;
        } else {
            speed = 0;
        }
    }
}