package com.walangtakas.core.enitity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.joml.Vector3f;

@Getter
@AllArgsConstructor
public class Entity {

    private Model model;
    private Vector3f pos, rotation;
    private float scale;

    public void incPost(float x, float y, float z) {
        this.pos.x += x;
        this.pos.y += y;
        this.pos.z += z;
    }

    public void setPost(float x, float y, float z) {
        this.pos.x = x;
        this.pos.y = y;
        this.pos.z = z;
    }

    public void incRotation(float x, float y, float z) {
        this.rotation.x += x;
        this.rotation.y += y;
        this.rotation.z += z;
    }

    public void setRotation(float x, float y, float z) {
        this.rotation.x = x;
        this.rotation.y = y;
        this.rotation.z = z;
    }


}
