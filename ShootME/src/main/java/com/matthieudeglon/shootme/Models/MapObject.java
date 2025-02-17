package com.matthieudeglon.shootme.Models;

import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.util.Pair;

public abstract class MapObject extends Pane {

    private double _width, _height;
    private Pair<Double, Double> _resolutionScalingFactors;

    MapObject(Pair<Double, Double> resolutionScalingFactors) {
        setResolutionScalingFactors(resolutionScalingFactors);
    }

    MapObject(double width, double height) {
        setDimensions(width, height);
    }

    protected final void positionTo(CoordinatesModel coordinates) {
        relocate(coordinates.getX(), coordinates.getY());
    }

    public final double getCurrentXPosition() {
        return getLayoutX();
    }

    public final double getCurrentYPosition() {
        return getLayoutY();
    }

    public final CoordinatesModel getCurrentPosition() {
        return new CoordinatesModel(getLayoutX(), getLayoutY());
    }

    protected final void addNodes(Node... nodes) {
        getChildren().addAll(nodes);
    }

    public final void setDimensions(double width, double height) {
        set_width(width);
        set_height(height);
    }

    public final double get_width() {
        return _width;
    }

    public final double get_height() {
        return _height;
    }

    public final Pair<Double, Double> getResolutionScalingFactors() {
        return _resolutionScalingFactors;
    }

    public final void set_width(double width) {
        _width = width;
    }

    public final void set_height(double height) {
        _height = height;
    }

    public final void setResolutionScalingFactors(Pair<Double, Double> resolutionScalingFactors) {
        _resolutionScalingFactors = resolutionScalingFactors;
    }
}
