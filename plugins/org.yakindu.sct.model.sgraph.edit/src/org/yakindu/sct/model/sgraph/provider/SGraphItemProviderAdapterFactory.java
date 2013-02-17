/**
 * Copyright (c) 2011 committers of YAKINDU and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * committers of YAKINDU - initial API and implementation
 * 
 */
package org.yakindu.sct.model.sgraph.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.yakindu.sct.model.sgraph.util.SGraphAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SGraphItemProviderAdapterFactory extends SGraphAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2011 committers of YAKINDU and others.\r\nAll rights reserved. This program and the accompanying materials\r\nare made available under the terms of the Eclipse Public License v1.0\r\nwhich accompanies this distribution, and is available at\r\nhttp://www.eclipse.org/legal/epl-v10.html\r\nContributors:\r\ncommitters of YAKINDU - initial API and implementation\r\n";

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SGraphItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.sct.model.sgraph.Region} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionItemProvider regionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.sct.model.sgraph.Region}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegionAdapter() {
		if (regionItemProvider == null) {
			regionItemProvider = new RegionItemProvider(this);
		}

		return regionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.sct.model.sgraph.Transition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionItemProvider transitionItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.sct.model.sgraph.Transition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionItemProvider(this);
		}

		return transitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.sct.model.sgraph.FinalState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinalStateItemProvider finalStateItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.sct.model.sgraph.FinalState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFinalStateAdapter() {
		if (finalStateItemProvider == null) {
			finalStateItemProvider = new FinalStateItemProvider(this);
		}

		return finalStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.sct.model.sgraph.Choice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChoiceItemProvider choiceItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.sct.model.sgraph.Choice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createChoiceAdapter() {
		if (choiceItemProvider == null) {
			choiceItemProvider = new ChoiceItemProvider(this);
		}

		return choiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.sct.model.sgraph.Statechart} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatechartItemProvider statechartItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.sct.model.sgraph.Statechart}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStatechartAdapter() {
		if (statechartItemProvider == null) {
			statechartItemProvider = new StatechartItemProvider(this);
		}

		return statechartItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.sct.model.sgraph.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryItemProvider entryItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.sct.model.sgraph.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntryAdapter() {
		if (entryItemProvider == null) {
			entryItemProvider = new EntryItemProvider(this);
		}

		return entryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.sct.model.sgraph.Exit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExitItemProvider exitItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.sct.model.sgraph.Exit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createExitAdapter() {
		if (exitItemProvider == null) {
			exitItemProvider = new ExitItemProvider(this);
		}

		return exitItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.sct.model.sgraph.ReactionProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReactionPropertyItemProvider reactionPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.sct.model.sgraph.ReactionProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createReactionPropertyAdapter() {
		if (reactionPropertyItemProvider == null) {
			reactionPropertyItemProvider = new ReactionPropertyItemProvider(this);
		}

		return reactionPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.sct.model.sgraph.Scope} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScopeItemProvider scopeItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.sct.model.sgraph.Scope}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createScopeAdapter() {
		if (scopeItemProvider == null) {
			scopeItemProvider = new ScopeItemProvider(this);
		}

		return scopeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.sct.model.sgraph.Synchronization} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SynchronizationItemProvider synchronizationItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.sct.model.sgraph.Synchronization}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSynchronizationAdapter() {
		if (synchronizationItemProvider == null) {
			synchronizationItemProvider = new SynchronizationItemProvider(this);
		}

		return synchronizationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.sct.model.sgraph.State} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateItemProvider stateItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.sct.model.sgraph.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStateAdapter() {
		if (stateItemProvider == null) {
			stateItemProvider = new StateItemProvider(this);
		}

		return stateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.sct.model.sgraph.Statement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementItemProvider statementItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.sct.model.sgraph.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStatementAdapter() {
		if (statementItemProvider == null) {
			statementItemProvider = new StatementItemProvider(this);
		}

		return statementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.yakindu.sct.model.sgraph.RegularState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegularStateItemProvider regularStateItemProvider;

	/**
	 * This creates an adapter for a {@link org.yakindu.sct.model.sgraph.RegularState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRegularStateAdapter() {
		if (regularStateItemProvider == null) {
			regularStateItemProvider = new RegularStateItemProvider(this);
		}

		return regularStateItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (regionItemProvider != null) regionItemProvider.dispose();
		if (transitionItemProvider != null) transitionItemProvider.dispose();
		if (finalStateItemProvider != null) finalStateItemProvider.dispose();
		if (choiceItemProvider != null) choiceItemProvider.dispose();
		if (statechartItemProvider != null) statechartItemProvider.dispose();
		if (entryItemProvider != null) entryItemProvider.dispose();
		if (exitItemProvider != null) exitItemProvider.dispose();
		if (reactionPropertyItemProvider != null) reactionPropertyItemProvider.dispose();
		if (scopeItemProvider != null) scopeItemProvider.dispose();
		if (synchronizationItemProvider != null) synchronizationItemProvider.dispose();
		if (stateItemProvider != null) stateItemProvider.dispose();
		if (statementItemProvider != null) statementItemProvider.dispose();
		if (regularStateItemProvider != null) regularStateItemProvider.dispose();
	}

}
