package com.volmit.iris.engine.dimension;

import com.google.gson.stream.JsonToken;
import com.volmit.iris.engine.editor.Resolvable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Accessors(fluent = true, chain = true)
@Resolvable.Entity(id = "biome")
public class IrisBiome extends IrisResolvable {
    private String name;

    @Builder.Default
    private IrisSurface surface = new IrisSurface();
}