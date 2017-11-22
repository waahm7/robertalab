package de.fhg.iais.roberta.visitor.sensor;

import de.fhg.iais.roberta.syntax.sensor.generic.BrickSensor;
import de.fhg.iais.roberta.syntax.sensor.generic.ColorSensor;
import de.fhg.iais.roberta.syntax.sensor.generic.CompassSensor;
import de.fhg.iais.roberta.syntax.sensor.generic.EncoderSensor;
import de.fhg.iais.roberta.syntax.sensor.generic.GetSampleSensor;
import de.fhg.iais.roberta.syntax.sensor.generic.GyroSensor;
import de.fhg.iais.roberta.syntax.sensor.generic.InfraredSensor;
import de.fhg.iais.roberta.syntax.sensor.generic.LightSensor;
import de.fhg.iais.roberta.syntax.sensor.generic.SoundSensor;
import de.fhg.iais.roberta.syntax.sensor.generic.TemperatureSensor;
import de.fhg.iais.roberta.syntax.sensor.generic.TimerSensor;
import de.fhg.iais.roberta.syntax.sensor.generic.TouchSensor;
import de.fhg.iais.roberta.syntax.sensor.generic.UltrasonicSensor;
import de.fhg.iais.roberta.util.dbc.DbcException;
import de.fhg.iais.roberta.visitor.AstVisitor;

public interface AstSensorsVisitor<V> extends AstVisitor<V> {
    /**
     * visit a {@link BrickSensor}.
     *
     * @param brickSensor to be visited
     */
    default V visitBrickSensor(BrickSensor<V> brickSensor) {
        throw new DbcException("BrickSensor not implemented!");
    }

    /**
     * visit a {@link ColorSensor}.
     *
     * @param colorSensor to be visited
     */
    default V visitColorSensor(ColorSensor<V> colorSensor) {
        throw new DbcException("ColorSensor not implemented!");
    }

    /**
     * visit a {@link LightSensor}.
     *
     * @param colorSensor to be visited
     */
    default V visitLightSensor(LightSensor<V> lightSensor) {
        throw new DbcException("LightSensor not implemented!");
    }

    /**
     * visit a {@link SoundSensor}.
     *
     * @param colorSensor to be visited
     */
    default V visitSoundSensor(SoundSensor<V> soundSensor) {
        throw new DbcException("SoundSensor not implemented!");
    }

    /**
     * visit a {@link EncoderSensor}.
     *
     * @param encoderSensor to be visited
     */
    default V visitEncoderSensor(EncoderSensor<V> encoderSensor) {
        throw new DbcException("EncoderSensor not implemented!");
    }

    /**
     * visit a {@link GyroSensor}.
     *
     * @param gyroSensor to be visited
     */
    default V visitGyroSensor(GyroSensor<V> gyroSensor) {
        throw new DbcException("GyroSensor not implemented!");
    }

    /**
     * visit a {@link InfraredSensor}.
     *
     * @param infraredSensor to be visited
     */
    default V visitInfraredSensor(InfraredSensor<V> infraredSensor) {
        throw new DbcException("InfraredSensor not implemented!");
    }

    /**
     * visit a {@link TimerSensor}.
     *
     * @param timerSensor to be visited
     */
    default V visitTimerSensor(TimerSensor<V> timerSensor) {
        throw new DbcException("BrickSensor not implemented!");
    }

    /**
     * visit a {@link TouchSensor}.
     *
     * @param touchSensor to be visited
     */
    default V visitTouchSensor(TouchSensor<V> touchSensor) {
        throw new DbcException("TouchSensor not implemented!");
    }

    /**
     * visit a {@link UltrasonicSensor}.
     *
     * @param ultrasonicSensor to be visited
     */
    default V visitUltrasonicSensor(UltrasonicSensor<V> ultrasonicSensor) {
        throw new DbcException("UltrasonicSensor not implemented!");
    }

    /**
     * visit a {@link CompassSensor}.
     *
     * @param compassSensor to be visited
     */
    default V visitCompassSensor(CompassSensor<V> compassSensor) {
        throw new DbcException("CompassSensor not implemented!");
    }

    /**
     * visit a {@link TemperatureSensor}.
     *
     * @param temperatureSensor to be visited
     */
    default V visitTemperatureSensor(TemperatureSensor<V> temperatureSensor) {
        throw new DbcException("TemperatureSensor not implemented!");
    }

    /**
     * visit a {@link GetSampleSensor}.
     *
     * @param sensorGetSample to be visited
     */
    default V visitGetSampleSensor(GetSampleSensor<V> sensorGetSample) {
        sensorGetSample.getSensor().visit(this);
        return null;
    }

}