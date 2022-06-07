// Made with Blockbench 4.2.2
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports


public class custom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart Chaise;

	public custom_model(ModelPart root) {
		this.Chaise = root.getChild("Chaise");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Chaise = partdefinition.addOrReplaceChild("Chaise", CubeListBuilder.create().texOffs(30, 28).addBox(11.14F, 1.0F, -1.528F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 24).addBox(4.0F, 0.5F, -1.528F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(12, 22).addBox(4.0F, 1.0F, -6.0F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(12, 22).addBox(11.14F, 0.92F, -5.5F, 2.0F, 2.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(24, 16).addBox(11.14F, -11.76F, 0.392F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(24, 17).addBox(4.06F, -11.76F, 0.392F, 2.0F, 13.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(23, 27).addBox(11.14F, 6.0F, -6.528F, 2.0F, 2.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(23, 26).addBox(4.06F, 6.5F, -6.288F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(16, 28).addBox(6.06F, -11.24F, 0.392F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(22, 29).addBox(4.06F, 6.0F, -7.288F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.21F, -11.76F, -0.268F, 11.0F, 12.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(3.21F, 0.24F, -6.268F, 11.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 16.0F, 8.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Chaise.render(poseStack, buffer, packedLight, packedOverlay);
	}
}