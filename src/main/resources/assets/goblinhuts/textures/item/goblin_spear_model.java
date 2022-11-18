// Made with Blockbench 4.5.1
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class custom_model extends EntityModel<Entity> {
	private final ModelPart Spear;
	private final ModelPart Shaft;
	private final ModelPart Head;
	private final ModelPart Head_r1;
	private final ModelPart bone3;
	public custom_model(ModelPart root) {
		this.Spear = root.getChild("Spear");
		this.bone3 = root.getChild("bone3");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Spear = modelPartData.addChild("Spear", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData Shaft = Spear.addChild("Shaft", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0F, -13.0F, 0.0F, 1.0F, 12.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Head = Shaft.addChild("Head", ModelPartBuilder.create().uv(8, 4).cuboid(-2.0F, -12.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F))
		.uv(7, 7).cuboid(0.0F, -12.0F, 0.0F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData Head_r1 = Head.addChild("Head_r1", ModelPartBuilder.create().uv(4, 4).cuboid(-1.0F, 1.0F, 0.0F, 3.0F, 3.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -17.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

		ModelPartData bone3 = modelPartData.addChild("bone3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
		return TexturedModelData.of(modelData, 16, 16);
	}
	@Override
	public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		Spear.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
		bone3.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}
}