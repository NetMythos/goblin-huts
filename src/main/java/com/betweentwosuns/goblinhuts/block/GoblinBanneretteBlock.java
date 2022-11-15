package com.betweentwosuns.goblinhuts.block;

import com.betweentwosuns.goblinhuts.block.tile.GoblinBanneretteTileEntity;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.Material;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class GoblinBanneretteBlock extends HorizontalFacingBlock implements BlockEntityProvider {

	public GoblinBanneretteBlock() {
		super(FabricBlockSettings.of(Material.WOOL));
		setDefaultState(this.stateManager.getDefaultState().with(Properties.HORIZONTAL_FACING, Direction.NORTH));
	}

	@Override
	public void appendProperties(StateManager.Builder<Block, BlockState> stateManager) {
		stateManager.add(Properties.HORIZONTAL_FACING);
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return (BlockState)this.getDefaultState().with(Properties.HORIZONTAL_FACING, ctx.getPlayerFacing().getOpposite());
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context){
		Direction dir = state.get(FACING);
		switch(dir) {
			case NORTH:
				return Block.createCuboidShape(1f, 1f, 12f, 15f, 16f, 16f);
			case SOUTH:
				return Block.createCuboidShape(1f, 1f, -2f, 15f, 16f, 2f);
			case EAST:
				return Block.createCuboidShape(8f, 1f, 5f, 22f, 16f, 9f);
			case WEST:
				return Block.createCuboidShape(-6f, 1f, 5f, 8f, 16f, 9f);
			default:
				return VoxelShapes.fullCube();
		}

	}

	@Override
	public BlockRenderType getRenderType(BlockState state) {
		return BlockRenderType.ENTITYBLOCK_ANIMATED;
	}

	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new GoblinBanneretteTileEntity(pos, state);
	}
}
