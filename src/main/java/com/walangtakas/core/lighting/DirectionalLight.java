package com.walangtakas.core.lighting;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.joml.Vector3f;

@Getter
@Setter
@AllArgsConstructor
public class DirectionalLight {
    private Vector3f color, direction;
    private float intensity;
}
