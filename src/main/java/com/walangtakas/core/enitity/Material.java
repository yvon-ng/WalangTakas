package com.walangtakas.core.enitity;

import com.walangtakas.core.utils.Consts;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.joml.Vector4f;

@Getter
@Setter
@AllArgsConstructor
public class Material {

    private Vector4f ambientColor, diffuseColor, specularColor;
    private float reflectance;
    private Texture texture;

    public Material() {
        this.ambientColor = Consts.DEFAULT_COLOR;
        this.diffuseColor = Consts.DEFAULT_COLOR;
        this.specularColor = Consts.DEFAULT_COLOR;
        this.texture = null;
        this.reflectance = 0;
    }

    public Material(Vector4f color,  float reflectance) {
        this(color, color, color, reflectance, null);
    }

    public Material(Texture texture) {
        this(Consts.DEFAULT_COLOR, Consts.DEFAULT_COLOR, Consts.DEFAULT_COLOR, 0, texture);
    }

    public Material(Vector4f color,  float reflectance, Texture texture) {
        this(color, color, color, reflectance, texture);
    }

    public boolean hasTexture() {
        return texture != null;
    }
}
